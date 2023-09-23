import requests

url = "https://apichallenges.herokuapp.com/challenges"

payload = {}
headers = {
  'X-CHALLENGER': '1102027b-d2fb-4b19-b0ed'
}

response = requests.request("GET", url, headers=headers, data=payload)

print(response.text)
