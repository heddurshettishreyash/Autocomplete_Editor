export const FetchDataset = async () => {
  try {
    const response = await fetch("http://localhost:8080/test");
    const result = await response.json();
    console.log(JSON.stringify(result));
    return result;
  } catch (error) {
    console.error("Error fetching data:", error);
    return [];
  }
};
